# Creating a README.md file with the questions and answers

questions_answers = """
# Spring & Java Questions and Answers

## 1. How do you declare REST endpoints in Spring?
**Options:**
- `@RestEndpoint`
- `@Rest`
- `@REST`
- `@RestController`

**Answer:** `@RestController`

## 2. By default, how many instances of a Spring bean would you find on the heap?
**Options:**
- One instance (singleton)
- One instance per class that specifies it as a dependency
- One instance per web request
- One instance per thread

**Answer:** One instance (singleton)

## 3. What annotation should replace `@xxx` to expose a GET endpoint at `/api/widget`?
**Options:**
- `@RequestMapping("api/widget")`
- `@RestEndpoint("api/widget")`
- `@GetMapping("api/widget")`
- `@ApiEndpoint("widget")`

**Answer:** `@GetMapping("api/widget")`

## 4. What method should you define in `UserRepository` to retrieve a `User` object by its ID?
**Options:**
- `findUserById(Long id)`
- `getById(Long id)`
- `findById(Long id)`
- `retrieveUserById(Long id)`

**Answer:** `findById(Long id)`

## 5. When a request object leaves the client, where does it first stop in a Spring application?
**Options:**
- `DispatcherServlet`
- The first Spring Controller it can find
- `Index.jsp` page
- `ViewResolver`

**Answer:** `DispatcherServlet`

## 6. Which Spring Boot annotation enables Single Sign-On (SSO) with an OAuth2 provider?
**Options:**
- `@OAuth2ClientAutoConfiguration`
- `@EnableSso`
- `@EnableOAuth2Client`
- `@OAuth2Client`

**Answer:** `@EnableSso`

## 7. What annotation enables Spring Batch processing?
**Options:**
- `@EnableWebProcessing`
- `@EnableBatch`
- `@EnableBatchProcessing`
- `@EnableSpringProcessing`

**Answer:** `@EnableBatchProcessing`

## 8. What high-level design pattern is at the core of Spring Security?
**Options:**
- Filter chain
- Actor
- Pub/Sub
- Visitor

**Answer:** Filter chain

## 9. Which Spring Boot module allows hot reload during development?
**Answer:** `spring-boot-devtools`

## 10. What annotation ensures that multiple database operations succeed or fail as a group?
**Answer:** `@Transactional`

## 11. Which is a valid constant declaration in Java?
**Options:**
- `define("MAXSIZE", 100);`
- `#define MAXSIZE 100`
- `const int MAXSIZE = 100;`
- `public static final int MAXSIZE = 100;`

**Answer:** `public static final int MAXSIZE = 100;`

## 12. Are private attributes visible from subclasses?
**Options:**
- True
- False

**Answer:** False

## 13. What is the most common method signature for obtaining a singleton?
**Options:**
- `instance()`
- `getInstance()`
- `getSingleton()`

**Answer:** `getInstance()`

## 14. Which option is preferred for handling unexpected behavior in Java?
**Options:**
- `System.exit(-1)`
- `return false`
- `throw new UnexpectedBehaviorException()`
- `System.err.println("Error: unexpected behavior")`

**Answer:** `throw new UnexpectedBehaviorException()`

## 15. In Java 8, can interfaces contain concrete methods?
**Options:**
- True
- False

**Answer:** True

## 16. Which class is used to test strings against a regular expression?
**Options:**
- `java.util.regex.RegExp`
- `java.util.regex.Match`
- `java.util.regex.Pattern`
- `java.util.regex.Regex`

**Answer:** `java.util.regex.Pattern`

## 17. Which built-in interface can be used as a single-argument function returning a boolean value in Java 8?
**Options:**
- `Predicate`
- `Comparator`
- `Functions`
- `Optional`

**Answer:** `Predicate`

## 18. When does an object become eligible for garbage collection?
**Options:**
- We need to do so manually by calling its `finalize()` method.
- When the object is no longer reachable from a root object.
- When the object is no longer reachable from a root object and only if the object defines a `finalize()` method.
- When the program terminates.

**Answer:** When the object is no longer reachable from a root object.

## 19. What is the annotation used to expose a method as a GET endpoint in Spring?
**Options:**
- `@RequestMapping`
- `@RestMapping`
- `@GetMapping`
- `@ApiEndpoint`

**Answer:** `@GetMapping`

## 20. What happens when a Spring bean's scope is defined as `prototype`?
**Options:**
- A single instance is created for the entire application.
- A new instance is created each time it is requested.
- One instance per HTTP session.
- One instance per HTTP request.

**Answer:** A new instance is created each time it is requested.

## 21. What is the default scope of a Spring bean?
**Options:**
- `singleton`
- `prototype`
- `session`
- `request`

**Answer:** `singleton`

## 22. What is the correct way to start a Spring Boot application?
**Options:**
- By deploying it on a web server.
- By running the `main()` method in a class annotated with `@SpringBootApplication`.
- By running the `run()` method in the `ApplicationContext` interface.
- By annotating a class with `@EnableAutoConfiguration`.

**Answer:** By running the `main()` method in a class annotated with `@SpringBootApplication`.

## 23. Which annotation is used to inject dependencies in Spring?
**Options:**
- `@Inject`
- `@Autowired`
- `@Resource`
- All of the above

**Answer:** All of the above

## 24. What does the `@Controller` annotation do in Spring?
**Options:**
- Marks a class as a Spring Controller and enables it to handle web requests.
- Marks a method as a request handler.
- Used to define REST APIs in Spring.
- None of the above.

**Answer:** Marks a class as a Spring Controller and enables it to handle web requests.

## 25. Which annotation is used to handle exceptions globally in a Spring application?
**Options:**
- `@ExceptionHandler`
- `@ControllerAdvice`
- `@RestControllerAdvice`
- All of the above

**Answer:** All of the above

## 26. In Java, which class provides a dynamic array implementation?
**Options:**
- `Vector`
- `ArrayList`
- `LinkedList`
- `HashMap`

**Answer:** `ArrayList`

## 27. Which is the correct way to iterate over a `HashMap` in Java 8?
**Options:**
- Using a `for` loop with `entrySet()`
- Using `keySet()` and iterating with a `for-each` loop
- Using streams with `forEach`
- All of the above

**Answer:** All of the above

## 28. What is the purpose of the `Optional` class in Java 8?
**Options:**
- To handle null values more gracefully.
- To replace `if-else` conditions.
- To avoid the use of exceptions.
- To improve performance.

**Answer:** To handle null values more gracefully.

## 29. What is a lambda expression in Java?
**Options:**
- A concise way to write anonymous classes.
- A method reference.
- A way to define a function in a single line.
- All of the above.

**Answer:** A concise way to write anonymous classes.

## 30. What is the function of the `@Transactional` annotation in Spring?
**Options:**
- To ensure transaction management is enabled.
- To enable JDBC connection pooling.
- To execute database queries asynchronously.
- To rollback operations on failure.

**Answer:** To rollback operations on failure.
"""

# Saving the questions and answers to a text file
file_path = "/mnt/data/Java_Spring_Questions_Answers.txt"

with open(file_path, "w") as file:
    file.write(questions_answers)

file_path  # Returning the file path so the user can download the file
