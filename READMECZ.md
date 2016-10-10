**[Czech](READMECZ.md)** | [English](README.md)

# Prosecutor API
[![Build Status](https://travis-ci.org/Prosecute/Prosecutor-API.svg?branch=master)](https://travis-ci.org/Prosecute/Prosecutor-API) [![Dependency Status](https://www.versioneye.com/user/projects/57fb88f9fb0ed200126a4952/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/57fb88f9fb0ed200126a4952)

| Stav API |
| -------- |
| [![API validation](http://online.swagger.io/validator?url=https://raw.githubusercontent.com/Prosecute/Prosecutor-API/master/documentation/swagger/swagger.yaml&.png)](https://prosecute.github.io/Swagger/)| 


> **Ve vývoji**

Prosecutor API je REST služba pro poskytování centrálního antiplagiátorského řešení. K samotnému testování využívá podsystém barrister. Nicméně testy lze provádět i přes JPlag či Moss. V tomto případě ale funguje pouze v [minimalist]() a dodává html výstup, nikoliv xml/json data.

* [Swagger dokumentace (EN)](https://prosecute.github.io/Swagger/)


## Ostatní části
 * [Prosecutor Planner](https://github.com/Prosecute/Prosecutor-Planner) 
 * [Barrister](https://github.com/Prosecute/Barrister)
 * Moodle plugin Prosecutor


## Technologie
 * Play framework
 * REST API
 * JPA + Hibernate
 * JAXB
 * Prosecutor Planner
 * Barrister

## Branche
 * develop - nestabilní a často i nefunkční build sloužící pro vývoj
 * master - stabilní build
 * snapshot - funkční snapshot develop branche, nicnémě nemusí být stabilní

## Nasazení Prosecutor API
 1. [Předpoklady](documentation/cz/deploy/PREREQUIREMENTS.md)
 2. [Kompilace](documentation/cz/deploy/COMPILE.md)
 3. [Instalace](documentation/cz/deploy/INSTALL.md)
 4. [Konfigurace](documentation/cz/deploy/CONFIGURATION.md)

## Implementace API
 1. [Začínáme](documentation/cz/api/GETTING_STARTED.md)
 2. [Autentizace a Autorizace](documentation/cz/api/OAUTH2.md)
 3. [Minimalist API](documentation/cz/api/MINIMALIST.md)
   1. t
 4. [Enterprise API](documentation/cz/api/ENTERPRISE.md)


## Slovníček pojmů
| Pojem | Vysvětlení |
| ----- | ---------- |
| Prosecutor | Označuje celou sadu nástrojů určených pro validaci, testování a odhalování plagiátů. |
| Prosecutor Planner | Plánovač a spouštěč testů s ohledem na aktuální vytížení serveru. |
| Prosecutor API | API |
| Barrister | Testovací engine, taktéž samostatně funkční s vlastním GUI. |
| Minimalist | |
| Entity | |
| Report | |
| Test | |