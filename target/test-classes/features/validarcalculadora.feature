#Creado por Edison Vasquez Burbano 11/07/2020
#language: es
@issue:CP-001
Característica: Realizar validaciones de cálculos para el módulo CALCULADORA DE CREDITO PARA VIVIENDA
  Como un usuario
  Quiero usar el formulario de CALCULADORA DE CREDITO PARA VIVIENDA
  Para realizar diferentes cálculos

  Antecedentes:
    Dado que el usuario Edison accede hasta la pagina de metrocuadrado
    Cuando accede hasta el modulo de CALCULADORA DE CREDITO PARA VIVIENDA

  @issue:CP-002
  @CalcularCuantoPrestan
  Esquema del escenario: Validar cálculos de crédito
    Dado que el usuario ingresa para el calculo de prestamo los datos <ingresosMensuales> y <plazoAnios>
    Cuando selecciona la opcion de calcular credito
    Entonces el ve los calculos correspondientes para prestamo
      | <vistaIngresosMensuales> | <valorPrestamo> | <cuotaInicial> | <valorInmueble> | <valorCuota> | <tasaInteres> |

    Ejemplos:
      | ingresosMensuales | plazoAnios | vistaIngresosMensuales | valorPrestamo | cuotaInicial  | valorInmueble | valorCuota  | tasaInteres |
      | 6000000           | 10 Años    | $ 6,000,000            | $ 137,369,269 | $ 58,872,544  | $ 196,241,812 | $ 1,800,000 | 10.25%      |
      | 8000000           | 20 Años    | $ 8,000,000            | $ 252,189,735 | $ 108,081,315 | $ 360,271,050 | $ 2,400,000 | 10.25%      |

  @issue:CP-003
  @MostrarTramitarCredito
  Esquema del escenario: Validar función Tramitar crédito en prestamo
    Dado que el usuario ingresa para el calculo de prestamo los datos <ingresosMensuales> y <plazoAnios>
    Cuando selecciona la opcion de calcular credito
    Y selecciona la opcion de Tramitar credito para prestamo
    Entonces el ve la ventana emergente para realizar tramite de credito

    Ejemplos:
      | ingresosMensuales | plazoAnios |
      | 6590000           | 5 Años     |

  @issue:CP-004
  @ValidarBotonDeshabilitado
  Escenario: Validar botones de Prestamo deshabilitado
    Dado que el no diligencia los ingresos mensuales
    Entonces el ve el boton de calcular credito deshabilitado

  @issue:CP-005
  @ValidarMontoMinimoIngreso
  Escenario: Validar monto mínimo de ingreso
    Dado que el usuario ingresa para el calculo de prestamo los datos 737716 y 20 Años
    Entonces el ve el mensaje de valor ingreso minimo

  @issue:CP-006
  @CalcularValorCuotas
  Esquema del escenario: Validar cálculos de cuotas
    Dado que el usuario ingresa para el calculo de cuotas los datos <valorCredito> y <plazoAnios>
    Cuando selecciona la opcion de calcular cuotas
    Entonces el ve los calculos correspondientes para cuotas
      | <vistaValorCredito> | <ingresosMensuales> | <cuotaInicial> | <valorInmueble> | <valorCuotaMensual> | <valorPrestamo> | <valorTasaInteres> |

    Ejemplos:
      | valorCredito | plazoAnios | vistaValorCredito | ingresosMensuales | cuotaInicial | valorInmueble | valorCuotaMensual | valorPrestamo | valorTasaInteres |
      | 15000000     | 5 Años     | $ 15,000,000      | $ 1,057,385       | $ 6,428,571  | $ 21,428,571  | $ 317,215         | $ 14,856,223  | 10.25%           |
      | 17000000     | 15 Años    | $ 17,000,000      | $ 601,953         | $ 7,285,714  | $ 24,285,714  | $ 180,586         | $ 16,598,937  | 10.25%           |

  @issue:CP-007
  @MostrarTramitarCuotas
  Esquema del escenario: Validar función Tramitar crédito en cuotas
    Dado que el usuario ingresa para el calculo de cuotas los datos <valorCredito> y <plazoAnios>
    Cuando selecciona la opcion de calcular cuotas
    Y selecciona la opcion de Tramitar credito para cuotas
    Entonces el ve la ventana emergente para realizar tramite de credito

    Ejemplos:
      | valorCredito | plazoAnios |
      | 16596500     | 15 Años    |

  @issue:CP-008
  @ValidarBotonDeshabilitado
  Escenario: Validar botones de Cuotas deshabilitado
    Dado que el no diligencia el valor del credito
    Entonces el ve el boton de calcular cuotas deshabilitado

  @issue:CP-009
  @ValidarMontoMinimoPrestamo
  Escenario: Validar monto mínimo de prestamo
    Dado que el usuario ingresa para el calculo de prestamo los datos 14999999 y 20 Años
    Entonces el ve el mensaje de valor credito minimo
