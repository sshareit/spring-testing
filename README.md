
## spring boot testing demo

This project has the following dependencies: 

- [DataTables](https://datatables.net/)
- [spring-data-jpa-datatables](https://github.com/darrachequesne/spring-data-jpa-datatables)



The CustomerControllerTest fails if we do not add the **ContextConfiguration** Annotation:


```
@ContextConfiguration(
    classes = {CustomerController.class, CustomerService.class, EntityManagerFactory.class}
)
```

