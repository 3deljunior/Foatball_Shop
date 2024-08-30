# Football Shop System

## Overview
This project is a simple Java application that simulates a football shop, utilizing Object-Oriented Programming (OOP) principles. It allows customers to purchase football items such as boots and soccer balls, with discounts applied to certain items.

## Features
- **Object-Oriented Design**: The project is designed using OOP principles, with classes representing different entities in the system (e.g., `Boots`, `SoccerBall`, `Customer`).
- **Boots and Soccer Balls**: Classes to represent football boots and soccer balls, each with their own pricing and discount logic.
- **Customer Management**: A `Customer` class that allows customers to buy multiple items and calculate the total amount due.
- **Discount Management**: The `DiscConsiderable` interface is implemented to handle discounts on certain items.
- **Custom Exceptions**: A `NotBallTypeException` to handle invalid soccer ball types, ensuring that only valid types are processed.

## Project Structure
- `FootballShop`: An abstract class representing a general football item.
- `Boots`: A subclass of `FootballShop` representing football boots.
- `SoccerBall`: A subclass of `FootballShop` representing soccer balls, with specific types like Professional Match, Training, etc.
- `Customer`: A class to manage customer details and purchases.
- `Invoice`: The main class that runs the application and simulates a customer buying items.
- `NotBallTypeException`: A custom exception for handling invalid soccer ball types.

## Author

[Youssef Adel](https://www.linkedin.com/in/youssef-adel-921ba624b/) -  Software developer.