# Cloud Google Compute Engine Estimation Automation Framework

This repository contains an automation framework for filling out the Google Cloud Compute Engine Estimation form and verifying the estimate summary. Built using **Selenium WebDriver**, **JUnit** for testing, and the **Page Object Model** (POM) for structuring the code, this framework supports various configurations and includes essential features for robust testing.

## Features

- **WebDriver Manager**: Automatically handles browser driver setup and configuration.
- **Page Object Model (POM)**: Provides a clear structure for managing web page interactions and elements.
- **Test Data Management**: Uses property files for different environments.
- **Test Suites**: XML-based suites for organizing and executing tests.
- **Screenshot Capture**: Automatically takes screenshots with timestamps on test failures.

## Prerequisites

- **Java 11** or higher
- **Maven 3.x**
- **Selenium WebDriver**
- **JUnit 5** for testing
- **Browser**: Chrome, Firefox, or others (ensure WebDriver manager is set up accordingly)
