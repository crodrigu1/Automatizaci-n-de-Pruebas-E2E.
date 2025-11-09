#language:es
Característica: Automatización del flujo principal de OrangeHRM

 Antecedentes:
    Dado que el usuario abre la página de inicio de sesión de OrangeHRM
    Cuando ingresa el nombre de usuario y la contraseña
    Y hace clic en el botón de inicio de sesión


  @CrearEmpleado
  Escenario: Agregar un nuevo empleado con información básica
  Dado que el usuario se encuentra en el módulo PIM
  Cuando selecciona la opción Add Employee
  Y ingresa los datos del nuevo empleado:
    | nombre | segundoNombre | apellido  |
    | Efrain | Daniel        | Rodriguez |
    Y carga una foto de perfil desde el archivo "foto_perfil.png"
   Y guarda la información del empleado


  @BuscarEmpleado
  Escenario: : Buscar y validar el empleado creado en el módulo Directory
  Dado que el usuario navega al módulo Directory
  Cuando ingresa el nombre del empleado "Efrain" en el filtro de búsqueda
  Y ejecuta la búsqueda
  Entonces el sistema debe mostrar el resultado con el empleado "Efrain Daniel Rodriguez"

