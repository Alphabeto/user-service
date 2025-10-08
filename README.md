# User Service - Vulnerable Application Demo

⚠️ **WARNING**: This application contains **intentionally vulnerable dependencies** for demonstration purposes. **DO NOT USE IN PRODUCTION!**

## Purpose

This is a demo application designed to showcase automated vulnerability detection and remediation using Snyk and Jenkins.

## Known Vulnerabilities

### Critical
- **Log4j 2.14.1** - CVE-2021-44228 (Log4Shell) - Remote Code Execution
- **Commons Text 1.9** - CVE-2022-42889 (Text4Shell) - Remote Code Execution

### High
- **Jackson 2.9.8** - Multiple deserialization vulnerabilities
- **Spring Boot 2.5.0** - Contains multiple vulnerable transitive dependencies

## API Endpoints

- `GET /` - Home page
- `GET /health` - Health check
- `GET /users` - List all users
- `GET /users/{id}` - Get specific user

## Scanning

```bash
# Scan with Snyk CLI
snyk test

# Generate JSON report
snyk test --json > vulnerabilities.json
```

## Expected Snyk Findings

Snyk should detect 15-25+ vulnerabilities including critical RCE issues.

