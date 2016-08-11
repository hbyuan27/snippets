#### PwoerMockito - ReadMe
- **PowerMockito Version Consistency**
Make sure PowerMockito maven versions are consistent, otherwise you will encountered below issue:
```
java.lang.NoClassDefFoundError: org/powermock/core/reporter/PowerMockReporter
at org.powermock.api.mockito.internal.mockcreation.MockTypeValidatorFactory.createValidator(MockTypeValidatorFactory.java:17)
```
The pom.xml of Maven should be like this:
```
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>1.10.19</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.powermock</groupId>
    <artifactId>powermock-api-mockito</artifactId>
    <version>1.6.5</version>
    <scope>test</scope>
</dependency>
<dependency>
  <groupId>org.powermock</groupId>
  <artifactId>powermock-module-junit4</artifactId>
  <version>1.6.5</version>
  <scope>test</scope>
</dependency>
```

- **Powermock and Mockito Compatibility**
```
Mockito                     PowerMock
1.10.8+                     1.6.2+
1.9.5-rc1 - 1.9.5           1.5.0 - 1.5.6
1.9.0-rc1 & 1.9.0           1.4.10 - 1.4.12
1.8.5                       1.3.9 to 1.4.9
1.8.4                       1.3.7 & 1.3.8 
1.8.3                       1.3.6
1.8.1 & 1.8.2               1.3.5
1.8                         1.3
1.7                         1.2.5
```