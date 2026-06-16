# GETTING-STARTED.md

# Getting Started

This guide explains how to clone and use this repository on your local machine.

---

## Prerequisites

Make sure you have the following installed:

* Git
* Java JDK 17+ (or your preferred version)
* IntelliJ IDEA / Eclipse / VS Code
* Maven (Optional)

Verify installation:

```bash
git --version
java --version
javac --version
```

---

## Clone Repository

### HTTPS

```bash
git clone https://github.com/MALLIKHARJUNCH-02/Complete-Java-Interview-Preparation.git
```

### SSH

```bash
git clone git@github.com:MALLIKHARJUNCH-02/Complete-Java-Interview-Preparation.git
```

---

## Navigate to Project

```bash
cd Complete-Java-Interview-Preparation
```

---

## Repository Structure

```text
Complete-Java-Interview-Preparation/

├── README.md
├── THEORY-ROADMAP.md
├── GETTING-STARTED.md

├── 01-INTERVIEW-QUESTIONS/
├── 02-THEORY-NOTES/
├── 03-CODING-SOLUTIONS/
├── 04-COMPANY-PREP/
├── 05-CHEAT-SHEETS/
└── 06-RESOURCES/
```

---

## Pull Latest Changes

Before starting work:

```bash
git pull origin main
```

---

## Create Your Own Branch (Recommended)

```bash
git checkout -b feature/my-feature
```

Example:

```bash
git checkout -b add-array-solutions
```

---

## Add New Solutions

Example:

```text
03-CODING-SOLUTIONS/

└── DSA/
    └── Arrays/
        └── 01-LargestElement/
            ├── Solution.java
            └── Explanation.md
```

---

## Commit Changes

```bash
git add .
git commit -m "Add largest element solution"
```

---

## Push Changes

```bash
git push origin feature/my-feature
```

---

## Update Local Repository

Fetch latest changes:

```bash
git pull origin main
```

---

## Useful Git Commands

### Check Status

```bash
git status
```

### View Commit History

```bash
git log --oneline
```

### View Branches

```bash
git branch
```

### Switch Branches

```bash
git checkout branch-name
```

### Delete Branch

```bash
git branch -d branch-name
```

---

## Troubleshooting

### Repository Already Exists

```bash
fatal: destination path already exists
```

Solution:

```bash
cd existing-folder
git pull origin main
```

### Authentication Failed

Use:

* GitHub Personal Access Token
* SSH Authentication

---

## Happy Coding 🚀

Practice consistently.

Recommended order:

1. Core Java
2. OOP
3. Collections
4. Exception Handling
5. Multithreading
6. Arrays
7. Strings
8. Linked List
9. Trees
10. Graphs
11. Dynamic Programming
