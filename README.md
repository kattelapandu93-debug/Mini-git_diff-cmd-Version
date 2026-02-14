# Mini-git_diff-cmd-Version
# Mini Git Diff (Command-Line Version)

A Java-based command-line tool that compares two text files and displays their differences using the **Longest Common Subsequence (LCS)** algorithm.  
This project is a simplified, educational version of how tools like `git diff` work internally.

---

## Features

- Reads two text files **line by line**
- Uses **Dynamic Programming (LCS)** to find common lines
- Identifies and prints:
  - Unchanged lines
  - Deleted lines
  - Inserted lines
- Works completely from the **command line**
- No external libraries required

---

## Core Concept

The project is built on the **Longest Common Subsequence (LCS)** algorithm.

- Each file is treated as a sequence of **lines**
- LCS finds the maximum number of lines that appear in both files in the same order
- Differences are detected by **backtracking the DP table**

### Diff Rules
- `  ` → Unchanged line  
- `-` → Line deleted from File 1  
- `+` → Line inserted in File 2  

---

## Technologies Used

- Java
- Dynamic Programming
- File I/O (`BufferedReader`)
- Git & GitHub

---
