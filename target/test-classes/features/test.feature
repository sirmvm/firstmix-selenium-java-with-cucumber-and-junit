#Author: MatiasValladares

Feature: Servicios de coaching
  Verificar el correcto funcionamiento de link de Servicios de Coaching
  
  Scenario: Ingresar a Servicio de coaching desde pagina Home
    Given El usuario se encuentra en la pagina Home de HappyFamily
    When Hacer click sobre el link en el navbar Servicios de Coaching
    Then Debe redirigir a la pagina Servicio de Coaching
 



