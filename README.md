# Dungeons and Dragons Companion API 🧙🏼

Welcome to the Dungeons and Dragons Companion API, an essential tool designed to enhance your gaming experience by providing a robust and easy-to-use interface for managing characters in your Dungeons & Dragons campaigns. Whether you're a Dungeon Master or a player, this API allows you to easily create, update and manage characters, teams and inventory to bring your adventures to life.

## Features

- Character Management: Create new characters, update their details and track their progress throughout your campaign.
- RESTful design: Utilise a RESTful API design for easy integration with different platforms and technologies.
- Open API Documentation: Access comprehensive API documentation through the Swagger UI, making it easy to understand and interact with the API's capabilities.

## Getting Started

To get started with the Dungeons and Dragons Companion API, follow these steps:

### Prerequisites

- Docker and Docker Compose installed on your machine.
- Basic understanding of RESTful APIs and how to interact with them.

### Setup

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Locate the `.example.env' file, populate and export the values of the environment variables specified in it. This file contains necessary configurations such as database connection details and application settings.
4. To run the project, open a terminal in the project directory and run the following command:

```shell
docker compose up --build
```

This command builds the Docker image and starts the containers defined in the `docker-compose.yaml` file. Wait for the process to complete, and ensure there are no errors in the output.

### Accessing the API

Once the application is running, you can access the Swagger UI to interact with the API:

[Swagger UI](http://localhost:8080/swagger-ui/index.html#)

The Swagger UI provides a user-friendly interface to explore the API endpoints, try out requests, and view responses. It's an invaluable tool for both developing and testing your integrations.

## Contributing

We welcome contributions to the Dungeons and Dragons Companion API! Whether it's submitting bug reports, suggesting enhancements, or contributing code, your input is highly appreciated. Please refer to our contribution guidelines for more information on how to participate in the project.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

---

Embark on your adventure with the Dungeons and Dragons Companion API, and bring your D&D campaigns to the next level. Happy advent!
