# redis-json-stock-management

Describing blogpost: https://blog.vreijsenj.nl/2022/03/29/preview-to-redis-om-spring-using-redis-json

## Technologies
* Java 17
* Spring Boot 2.6.4
* Spring Data Redis
* Redis OM Spring (PREVIEW)

## Using Redis OM Spring Preview
As the RedisOM Spring does not have an official release yet, we need to add the following repository to be able to resolve the snapshot dependency.

```groovy
repositories {
	mavenCentral()
	maven {
		url "https://s01.oss.sonatype.org/content/repositories/snapshots"
	}
}
```
