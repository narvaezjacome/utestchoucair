# language: es

Característica: Autenticacion correcta en la aplicacion de Utest
  Como usuario interesado en utilizar los servicios de Utest.com
  Deseo poder registrarme en el sitio de manera rápida y sencilla
  Para comenzar a utilizar los servicios disponibles.

  @Register
  Esquema del escenario: Crear un nuevo usuario en Utest.com
    Dado que Daniel esta en la página de Utest.com
    Cuando hago clic en la opción de registro JOIN TODAY
    Y diligencio el formulario para crear un nuevo usuario
      | firstname   | lastname   | month   | day   | year   | languages   | createyourutestpassword   | confirmpassword   |
      | <firstname> | <lastname> | <month> | <day> | <year> | <languages> | <createyourutestpassword> | <confirmpassword> |
    Entonces valido mi registro con el siguiente mensaje Welcome to the world's largest community of freelance software testers!

    Ejemplos:
      | firstname | lastname    | month     | day | year | languages | createyourutestpassword | confirmpassword |
      | testname  | testlasname | september | 8   | 1990 | Spanish   | Pass123456789*/         | Pass123456789*/ |

