Feature: Operaciones de la Calculadora Básica 
 
  Para verificar el correcto funcionamiento de la calculadora 
  Como usuario 
  Quiero poder realizar operaciones matemáticas y ver los resultados correctos 
 
  Scenario: Suma de dos números enteros
  Given Navego a la página de la Calculadora Básica
  When Ingreso 7 en el campo "Build"
  And Ingreso 2 en el campo "Number 1"
  And Ingreso 3 en el campo "Number 2"
  And Selecciono la operación "Add"
  And Hago clic en el botón "Calculate"
  # Then Debería ver 5 como resultado en el campo "Answer"

Scenario: Resta de dos números enteros
  Given Navego a la página de la Calculadora Básica
  When Ingreso 7 en el campo "Build"
  And Ingreso 10 en el campo "Number 1"
  And Ingreso 4 en el campo "Number 2"
  And Selecciono la operación "Subtract"
  And Hago clic en el botón "Calculate"
  # Then Debería ver 6 como resultado en el campo "Answer"

Scenario: Limpiar campos de entrada y resultado
  Given Navego a la página de la Calculadora Básica
  When Ingreso 7 en el campo "Build"
  And Ingreso 5 en el campo "Number 1"
  And Ingreso 7 en el campo "Number 2"
  And Selecciono la operación "Multiply"
  And Hago clic en el botón "Calculate"
  And Hago clic en el botón "Clear"
  # Then El campo Number 1 debería estar vacío
  # And El campo Number 2 debería estar vacío
  # And El campo Answer debería estar vacío

Scenario: Operación de concatenación con dos cadenas
  Given Navego a la página de la Calculadora Básica
  When Ingreso 7 en el campo "Build"
  And Ingreso Hola en el campo "Number 1"
  And Ingreso Mundo en el campo "Number 2"
  And Selecciono la operación "Concatenate"
  And Hago clic en el botón "Calculate"
  # Then Debería ver "HolaMundo" como resultado en el campo "Answer"

Scenario: Suma de dos números decimales con la opción "Integer Only" desmarcada
  Given Navego a la página de la Calculadora Básica
  And Desmarco la casilla "Integer Only"
  When Ingreso 7 en el campo "Build"
  And Ingreso 2.5 en el campo "Number 1"
  And Ingreso 3.7 en el campo "Number 2"
  And Selecciono la operación "Add"
  And Hago clic en el botón "Calculate"
  # Then Debería ver 6.2 como resultado en el campo "Answer"
