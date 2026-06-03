# ==============================================================================
# THE MASTER BLUEPRINT FOR VIRTUAL ENVIRONMENTS & PIP MANAGEMENT
# ==============================================================================

# ------------------------------------------------------------------------------
# 1. CREATING A VIRTUAL ENVIRONMENT
# ------------------------------------------------------------------------------
# Python has a built-in module called 'venv'. 
# Syntax: python -m venv <name_of_environment_folder>
# Developers traditionally name the folder '.venv' or 'env'.

# python -m venv .venv

# What just happened under the hood?
# Python created a hidden folder named '.venv' in your project directory. 
# Inside this folder, it copied the Python executable and built a clean, 
# empty 'site-packages' folder where your project's libraries will live.


# ------------------------------------------------------------------------------
# 2. ACTIVATING THE ENVIRONMENT
# ------------------------------------------------------------------------------
# Before you install any library, you must "step inside" the sandbox. 
# The command differs based on your computer's Operating System:

# # On Windows (Command Prompt):
# .venv\Scripts\activate

# # On Windows (PowerShell):
# .venv\Scripts\Activate.ps1

# On macOS and Linux:
# source .venv/bin/activate

# How to verify it worked:
# Your terminal prompt will now show the environment name in parentheses, 
# looking like this: (.venv) user@computer:~/my_project$


# ------------------------------------------------------------------------------
# 3. CRITICAL PIP COMMANDS INSIDE A VIRTUAL ENVIRONMENT
# ------------------------------------------------------------------------------
# Once activated, any 'pip install' command installs packages ONLY inside 
# your project's local '.venv' folder, completely leaving your system global Python alone.

# --- Command A: Install a Package ---
# pip install requests
# # Installs the latest version of requests.

# # --- Command B: Install a Specific Version ---
# pip install pandas==2.2.0
# # Forces pip to fetch that exact version for compatibility tracking.

# # --- Command C: View Installed Packages ---
# pip list
# Displays a clean terminal table showing only the packages inside this active sandbox.


# ------------------------------------------------------------------------------
# 4. DEPENDENCY TRACKING (The Requirements Engine)
# ------------------------------------------------------------------------------
# When sharing your code on GitHub or with team members, you NEVER upload the 
# '.venv' folder (it's massive and system-specific). Instead, you share a text 
# blueprint file called 'requirements.txt'.

# --- Step 1: Generate the Blueprint ---
# pip freeze > requirements.txt
# This captures every single library and exact version currently running in your 
# sandbox and writes it instantly into a clean text file.

# --- Step 2: Recreate the Environment from a Blueprint ---
# When your teammate downloads your code, they create an empty environment, activate it, and run:
# pip install -r requirements.txt
# Pip reads the text file line-by-line and reproduces your exact setup down to the version decimal!


# ------------------------------------------------------------------------------
# 5. DEACTIVATING AND DELETING
# ------------------------------------------------------------------------------

# --- To Leave the Environment ---
# deactivate
# # This safely drops you back out into your computer's global system command line.

# # --- To Completely Delete the Environment ---
# # Since everything lives inside that single folder, you don't need an uninstaller. 
# # Simply turn off activation and delete the folder from your file manager or run:
# rm -rf .venv