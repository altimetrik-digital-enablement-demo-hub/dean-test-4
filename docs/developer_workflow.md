# Developer Workflow

This document outlines our branching strategy and workflow for developers contributing to this project.

## Branching Strategy: Trunk-Based Development

We follow a trunk-based development workflow, with `main` as our trunk branch.

### Key Principles

- The `main` branch is always deployable and contains production-ready code
- Feature development happens in short-lived feature branches
- Changes are integrated frequently through pull requests
- Small, incremental changes are preferred over large batches

## Developer Workflow

### 1. Starting New Work

To start working on a new feature or bug fix:

```bash
# Ensure your local main branch is up to date
git checkout main
git pull origin main

# Create a new feature branch
git checkout -b feature/your-feature-name
```

Name your branches following our conventions:
- `feature/description` - For new features
- `bugfix/description` - For bug fixes
- `hotfix/description` - For critical production fixes
- `refactor/description` - For code refactoring with no functional changes

### 2. Making Changes

While working on your branch:

- Commit changes frequently with clear, descriptive commit messages
- Follow our coding standards and practices
- Write tests for new functionality
- Keep your branch up to date with main

```bash
# Periodically update your branch with changes from main
git checkout main
git pull origin main
git checkout feature/your-feature-name
git merge main
```

### 3. Creating a Pull Request

When your changes are ready for review:

1. Push your branch to the remote repository
   ```bash
   git push origin feature/your-feature-name
   ```

2. Create a pull request (PR) through the GitHub interface
   - Set the base branch as `main`
   - Give your PR a clear title and description
   - Reference any related issues
   - Add appropriate reviewers

### 4. Code Review Process

- All code changes require at least one approval from a team member
- Address feedback by making additional commits to your branch
- Once approved, your changes can be merged

### 5. Merging to Main

After your PR is approved:

1. Ensure your branch is up to date with main
2. Resolve any merge conflicts
3. Make sure all CI checks pass
4. Merge your changes into main

## Best Practices

- Keep branches short-lived (1-3 days ideally)
- Make small, focused commits with descriptive messages
- Write clear PR descriptions that explain the purpose and impact of changes
- Keep PRs reasonably sized for effective review
- Delete branches after they're merged

## Handling Production Issues

For urgent production fixes:

1. Create a `hotfix/description` branch directly from `main`
2. Make the necessary fixes
3. Create a PR for review
4. After approval, merge to `main`

By following this trunk-based development workflow, we maintain a clean, stable codebase while enabling rapid, collaborative development.