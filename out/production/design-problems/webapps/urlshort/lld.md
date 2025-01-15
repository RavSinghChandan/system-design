# 🌐 URL Shortening Service - Low-Level Design (LLD)

## 🏗️ Overview

The URL Shortening Service is designed to take long URLs and generate short URLs for easier sharing. The service uses an in-memory data structure (HashMap) to store mappings between long and short URLs.

---

## 🔧 Components

### 1. **URLShorteningService**
- **Purpose**: The main service class responsible for generating short URLs and retrieving the original URLs based on short URLs.
- **Attributes**:
    - `BASE_URL`: The base URL to prepend to the shortened code to form the full short URL.
    - `CHARACTERS`: The characters used to generate the shortened URL (letters and digits).
    - `SHORT_URL_LENGTH`: The length of the shortened URL (6 characters).
    - `shortToLongMap`: A HashMap to store the mapping from short URL code to the original long URL.
    - `longToShortMap`: A HashMap to store the reverse mapping from the long URL to the short URL code.

---

## 🔑 Key Classes

### **URLShorteningService**

#### Methods:

- **shortenURL(String longUrl)**:
    - **Purpose**: Takes a long URL and returns a short URL.
    - **Logic**:
        - If the URL has already been shortened, return the existing short URL.
        - If not, generate a new 6-character short URL and store the mapping.
    - **Input**: `longUrl` (String).
    - **Output**: Shortened URL (String).

- **getOriginalURL(String shortUrl)**:
    - **Purpose**: Takes a short URL and returns the original long URL.
    - **Logic**: Extracts the short code from the URL and retrieves the corresponding long URL from `shortToLongMap`.
    - **Input**: `shortUrl` (String).
    - **Output**: Original long URL (String).

- **generateShortCode()**:
    - **Purpose**: Generates a random 6-character code from a predefined set of characters.
    - **Logic**: Randomly selects characters from the `CHARACTERS` string and constructs the short URL code.
    - **Input**: None.
    - **Output**: Randomly generated 6-character string.

---