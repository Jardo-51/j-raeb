# Java REST API Evolution Blueprint (J-RAEB)

This project aims to describe best practices with regards to defining, developing, sharing and evolving REST APIs in Java-based microservice systems.

## Back Story

I first came up with this concept around 2017 (7 years ago at the time of writing this) when I was programming microservices in Java with Maven and Spring.

Over the years, I have used this concept successfully in several projects, and I have been constantly improving it until today, based on practical experience  (and I am open to suggestions for further improvements).

## Basic Idea

The standard way of implementing a REST API server in Java is by using [Spring MVC](https://www.baeldung.com/spring-mvc-tutorial) (or Spring Webflux for reactive projects). In Spring Web you define a REST controller by putting annotations on a class. Here is an example:

```java
@Slf4j
@RestController
public class EmailController {

	@PostMapping(path = "/api/email/send")
	public EmailSendingResultDto sendEmail(@RequestBody EmailDto emailDto) {
		log.info("Sending email '{}'", emailDto);
		return EmailSendingResultDto.OK;
	}

}
```

On the client side, we can also use this declarative approach by utilizing [Feign](https://www.javatodev.com/how-to-use-feign-client-in-spring-boot/) (or Feign Reactive for reactive projects). In Feign, you can define a REST client by annotating an interface:

```java
@FeignClient(name = "emailClient", url = "${integration.email.url}")
public interface EmailClient {

	@PostMapping(path = "/api/email/send")
	EmailSendingResultDto sendEmail(@RequestBody EmailDto emailDto);

}
```

We can see that both on the client and server side, we have an annotated class (interface), with the API definition. This is basically duplicate code. So why not extract it into a common ancestor?

### Extracting API Definitions

We can extract the API definitions into a common interface like this:

```java

```

Then we can define the controller like this:

```java


```

... and the Feign client like this:

```java


```

The controller class and the client interface are most likely in two separate projects (microservices). And for that reason, we have to create a library, which contains the API definition.

Now both the server and client microservice can include this library.

Having the API definitions in one shared library also gives us the ability to document and version API changes - every time there is a change to the API, we create a new version of the library project (using semantic versioning) and document the changes in a changelog file.

This approach gives us confidence, that as long as the server and client microservice use the same version of the library, they will be able to communicate with each other (their APIs are compatible).

Actually, the server and client do not even have to use the same version. The versions just need to be compatible according to semantic versioning.
