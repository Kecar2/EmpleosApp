# HiringApp

### ¿Cual es la funcionalidad de la aplicación HiringApp?

- El proyecto que vamos a desarrollar es una aplicación web para publicar ofertas de trabajo en Internet. 
- Esta aplicación esta estructurada en dos secciones principales:

#### Front-End: 

- Esta es la parte pública de la aplicación y estará abierta al público en general. 
- En la página principal se mostrarán las ofertas de trabajo mas destacadas que han sido publicadas por un administrador. 
- En la página principal también se encuentrá un formulario para buscar ofertas de trabajo por Descripción y por Categorías. 
- Al hacer clic en una oferta de trabajo se mostrarán los detalles de esta vacante. 
- Estos detalles son por ejemplo: fecha de publicación, salario ofrecido, detalles de la vacante (requisitos, requerimientos, prestaciones ofrecidas, datos de contacto, etc. 
- En la página de los detalles de una vacante existirá un botón para que el usuario, siempre y cuando haya iniciado sesión pueda enviar si Curriculm Vitae para aplicar para la Vacante. 
- Finalmente, en la página principal de la aplicación también existirá un botón para que los usuarios puedan registrarse en la aplicación.

#### Back-End: 

- Esta es la parte privada de la aplicación y únicamente tendrán acceso los administradores. 
- En esta sección los administradores podrán administrar la aplicación. 
- Básicamente existirán 3 tipos de usuarios o roles: SUPERVISOR, ADMINISTRADOR y USUARIO. 
- El SUPERVISOR: tendrá acceso al catálogo de vacantes, categorías y solicitudes enviadas. 
- El ADMINISTRADOR: tendrá acceso al catálogo de vacantes, categorías, solicitudes enviadas y el catálogo de usuarios registrados. 
- El USUARIO: solo tendra permisos para Aplicar (enviar Curriculum Vitae) para una determinada Vacante.

# Built With

- Java
- Spring Boot / Spring MVC / Thymeleaf / Spring Data JPA / Spring Security / RestFul Web Services
- MySQL
- Bootstrap
