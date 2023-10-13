# 123213
Decorator Design Pattern: The Decorator design pattern is a structural pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. It involves creating a set of decorator classes that are used to wrap concrete components. Decorators add new functionality to the components they wrap without altering their structure. This pattern promotes open-closed design principles, making it easy to extend and modify the behavior of objects.
Use Case: The Decorator pattern is commonly used when you need to add or modify the behavior of objects dynamically. It's particularly useful when you have a base class with several optional features or when you want to avoid creating a class hierarchy with a combinatorial explosion of subclasses. In the context of the assignment, we used the Decorator pattern to customize coffee orders with different condiments (decorators) while keeping the core coffee class simple and unchanged.
Screenshots and Results: As a text-based AI model, I can't provide screenshots. However, I can describe what you might see when running the provided Java code.
When you run the CoffeeShop class, you should see output like this:

Order: Espresso
Cost: $3.0
Order: Latte, Sugar
Cost: $7.0
The first order is for a simple Espresso, and the second order is for a Latte with Sugar. You can create more complex orders by adding additional decorators.
Additional Insights:
    1. The Decorator pattern allows you to add and combine features in a flexible and reusable way, making it ideal for scenarios where you need to customize objects at runtime.
    2. By using decorators, you can avoid creating numerous subclasses for all possible combinations of features, which can lead to a more maintainable and scalable codebase.
    3. The pattern encourages a clear separation between the core component and the decorators, which makes it easier to understand and extend the system.
    4. Care should be taken to ensure that the decorators don't introduce unnecessary complexity. Keep the decorators simple and focused on their specific responsibilities.
    5. The Decorator pattern is a great choice when you have an open-ended set of options or when you want to avoid a class explosion. However, it might not be the best choice when the set of options is fixed and known in advance. In such cases, other patterns like the Builder pattern might be more suitable.
