# Phase IV – Automated Regression (Randoop)

This repo includes a simple workflow to **generate regression tests** with **Randoop** for the Java codebase (Windows + VS Code).

## Prerequisites
- Java 11+ installed (`java -version`).
- Randoop jar at: `tools\randoop\randoop-all-4.3.2.jar`  
  (If you downloaded a newer version, update the filename in the script.)
- Project structure like:
  ```text
  YourProject/
    src/main/java/...
    src/test/java/...
    tools/randoop/randoop-all-4.3.2.jar
  ```

## What the script does
`gen-randoop.ps1`:
1. Compiles `src/main/java` into `out\classes`.
2. Runs Randoop for selected classes (business, data, domain).
3. Writes generated tests under `out\randoop\randooptests\`.
4. Copies them into `src\test\java\randooptests\` for version control.
5. Prints a short summary of results.

## Usage
From the project root in **PowerShell**:
```powershell
./gen-randoop.ps1           # default 60s per class
./gen-randoop.ps1 -TimeLimit 90  # try longer exploration
```

> Edit the **Targets** array inside the script if you want to add/remove classes.

## Notes
- We intentionally **skip** presentation/UI classes to avoid I/O-driven flakiness.
- If zero tests are generated, raise `-TimeLimit` or ensure the target classes are reachable and compiled.
- Generated package is `randooptests` to keep it separate from handwritten tests.

## Optional: run tests
- **Maven (if configured):**
  ```powershell
  mvn -q -Dtest="randooptests.*" test
  ```
- **JUnit Console (no Maven):**
  1. Download `junit-platform-console-standalone-<version>.jar` to `tools\junit\`.
  2. Compile tests to `out\test-classes` and run:
     ```powershell
     javac -d out\test-classes -cp "out\classes;tools\junit\junit-platform-console-standalone-*.jar" (Get-ChildItem -Recurse src\test\java\*.java).FullName
     java -jar tools\junit\junit-platform-console-standalone-*.jar --scan-class-path -cp "out\classes;out\test-classes"
     ```

## Deliverables for Phase IV
- Commit the generated files under `src/test/java/randooptests/`.
- Include this `README-Randoop.md` in the repo.
- Record a short video showing: project tree → run script → show generated test files → (optional) run tests → commit & push.
