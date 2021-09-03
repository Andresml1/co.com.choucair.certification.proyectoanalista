# Autor: Andres
  @stories
  Feature: Academy choucair
    As a use, I want to learn how to automate in screamplay at the choucair Academy with the automation course
    @scenario
    Scenario: Search for automation course
      Given than brandon wants to learns automation at the academy Choucair
      | strUser | strPassword |
      | <strUser> | <strPassword> |
      When he search for the course Recursos Automation Bancolombia on the choucair academy platform
        | strCourse  |
        | <strCourse>|
      Then he finds the course called resources Recursos Automation Bancolombiax
        | strCourse  |
        | <strCourse>|

      Examples:
        | strUser | strPassword || strCourse  |
        | 1128461654| Choucair2021* | | Recursos Automatización Bancolombia|
