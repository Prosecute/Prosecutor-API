> **Ve vývoji**

## Language
 * [Czech](READMECZ.md)
 * [English](README.md)
# Prosecutor API
Prosecutor API je REST služba pro poskytování centrálního antiplagiátorského řešení. K samotnému testování využívá podsystém barrister. Nicméně testy lze provádět i přes JPlag či Moss. V tomto případě ale funguje pouze v [minimalist]() a dodává html výstup, nikoliv xml/json data.

* [Swagger dokumentace (EN)]()


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
### Předpoklady
 * Java 8
 * MySQL nebo PostgreSQL
 * SSL Certifikát pro https


### Kompilace
### Instalace
### Configurace

## Implementace API
 


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