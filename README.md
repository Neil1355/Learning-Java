# Learning Java — Organized Examples

This folder contains a large set of small Java example programs organized by topic (arrays, collections, threads, I/O, GUI, projects, etc.). 

## Goals
- Provide a readable, runnable collection of Java examples for study.
- Provide a starting point for learning Java.

## Prerequisites
- Java JDK (javac/java) installed and available on `PATH`.
- PowerShell (this README uses PowerShell commands and was verified on Windows).

## Quick start — compile everything (PowerShell)
1. Open PowerShell and change to this `src` folder:

```powershell
Set-Location -Path 'C:\Users\neilb\eclipse-workspace\first project\src'
```

2. Compile all `.java` files into a binary output folder named `after_fixes_bin`:

```powershell
# $files collects every .java path under src
# this is safe for PowerShell even when there are many files
$files = Get-ChildItem -Path . -Recurse -Filter '*.java' -File | ForEach-Object { $_.FullName }
javac -d after_fixes_bin @($files)
```

Notes:
- If `javac` is not found, install a JDK (Temurin/AdoptOpenJDK, Oracle JDK, etc.) and add it to your `PATH`.
- If you hit an "illegal character: '\ufeff'" error, the file contains a UTF-8 BOM. Re-save the file without BOM (most editors have an option).

## Run specific examples
Many classes are in the default package (no package declaration). To run a program after compiling:

```powershell
# run Accountbalance (example)
java -cp after_fixes_bin Accountbalance

# run Bank interactively
java -cp after_fixes_bin Bank

# run Bank with piped input from the provided sample
type bank_input.txt | java -cp after_fixes_bin Bank
```

If a class has a package declaration (for example `package learning.arrays;`), run it by its fully-qualified name:

```powershell
java -cp after_fixes_bin learning.arrays.CharArrayExample
```

## Small curated examples
- `Bank` — a small CLI banking demo (sample input: `bank_input.txt`).
- `Accountbalance` — simple account/balance example.
- `datastructures/TreeSetDemo.java` — demonstrates TreeSet (shows an unchecked-operations note when compiled).

## Troubleshooting & common fixes
- `javac` not found: install a JDK and ensure it is on your `PATH`.
- NoSuchElementException during non-interactive runs: some examples read from `System.in` multiple times (multiple `Scanner(System.in)` instances). For non-interactive testing, prefer piping a prepared input as shown above.
- Encoding/BOM issues: if javac complains about `\ufeff`, re-save the affected `.java` as UTF-8 without BOM.
