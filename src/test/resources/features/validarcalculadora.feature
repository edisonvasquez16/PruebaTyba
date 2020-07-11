#Creado por Edison Vasquez Burbano
#language: es
@issue:TP-001
Característica: Realizar validaciones de cálculos para el módulo CALCULADORA DE CREDITO PARA VIVIENDA
  Como un usuario
  Quiero usar el formulario de CALCULADORA DE CREDITO PARA VIVIENDA
  Para realizar diferentes cálculos

  Antecedentes:
    Dado que el usuario Edison accede hasta la pagina de metrocuadrado
    Cuando accede hasta el modulo de CALCULADORA DE CREDITO PARA VIVIENDA

  @issue:TP-002
    @CalcularCuantoPrestan
  Esquema del escenario: Validar cálculos de crédito
    Dado que el usuario ingresa para el calculo de prestamo los datos <ingresosMensuales> y <plazoAnios>
    Cuando selecciona la opcion de calcular credito
    Entonces el ve los calculos correspondientes para prestamo
      | <vistaIngresosMensuales> | <valorPrestamo> | <cuotaInicial> | <valorInmueble> | <valorCuota> | <tasaInteres> |

    Ejemplos:
      | ingresosMensuales | plazoAnios | vistaIngresosMensuales | valorPrestamo | cuotaInicial  | valorInmueble | valorCuota  | tasaInteres |
      | 5000000           | 5 Años     | $ 5,000,000            | $ 70,929,705  | $ 30,398,445  | $ 101,328,150 | $ 1,500,000 | 10.25%      |
      | 6000000           | 10 Años    | $ 6,000,000            | $ 137,369,269 | $ 58,872,544  | $ 196,241,812 | $ 1,800,000 | 10.25%      |
      | 7000000           | 15 Años    | $ 7,000,000            | $ 197,689,870 | $ 84,724,230  | $ 282,414,101 | $ 2,100,000 | 10.25%      |
      | 8000000           | 20 Años    | $ 8,000,000            | $ 252,189,735 | $ 108,081,315 | $ 360,271,050 | $ 2,400,000 | 10.25%      |

  @issue:TP-003
    @CalcularValorCuotas
  Esquema del escenario: Validar cálculos de cuotas
    Dado que el usuario ingresa para el calculo de cuotas los datos <valorCredito> y <plazoAnios>
    Cuando selecciona la opcion de calcular cuotas
    Entonces el ve los calculos correspondientes para cuotas
      | <vistaValorCredito> | <ingresosMensuales> | <cuotaInicial> | <valorInmueble> | <valorCuotaMensual> | <valorPrestamo> | <valorTasaInteres> |


    Ejemplos:
      | valorCredito | plazoAnios | vistaValorCredito | ingresosMensuales | cuotaInicial  | valorInmueble  | valorCuotaMensual | valorPrestamo | valorTasaInteres |
      | 15000000     | 5 Años     | $ 15,000,000      | $ 1,057,385       | $ 6,428,571   | $ 21,428,571   | $ 317,215         | $ 14,856,223  | 10.25%           |
      | 16000000     | 10 Años    | $ 16,000,000      | $ 698,846         | $ $ 6,857,143 | $ $ 22,857,143 | $ 209,654         | $ 15,722,468  | 10.25%           |
      | 17000000     | 15 Años    | $ 17,000,000      | $ 601,953         | $ 7,285,714   | $ 24,285,714   | $ 180,586         | $ 16,598,937  | 10.25%           |
      | 18000000     | 20 Años    | $ 18,000,000      | $ 570,999         | $ 7,714,286   | $ 25,714,286   | $  171,300        | $ 17,486,953  | 10.25%           |

  @issue:TP-004
  @ValidarBotonDeshabilitado
  Escenario: Validar botones de Prestamo deshabilitado
    Dado que el no diligencia los ingresos mensuales
    Entonces el ve el boton de calcular credito deshabilitado

  @issue:TP-005
  @ValidarBotonDeshabilitado
  Escenario: Validar botones de Cuotas deshabilitado
    Dado que el no diligencia el valor del credito
    Entonces el ve el boton de calcular cuotas deshabilitado
