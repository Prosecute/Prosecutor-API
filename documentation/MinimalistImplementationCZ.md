# Implementace Minimalist
Ukázkovou implementaci naleznete zde:
* [Minimalist ukázková implementace](MinimalistExampleCZ.md)


## Struktura

## Spuštění testu
### Asynchroní volání
```
GET {API_URL}/minimalist/{id}/run
```

#### Informace o provedení testu 
##### Report
Prvním způsobem jak se dozvědět jestli byl test proveden je volání url pro získání reportu:
```
GET {API_URL}/minimalist/{id}/report
```
Pokud test nebyl ještě proveden tak tato adresa vrátí:
```
204 - No content
```
##### Callback
Druhým způsobem je při volání url přidat parametr callback s návratovou url a požadovaným MIME typem.
V současnosti je podporovaný pouze
* application/xml (defaultní)
* application/json
 

> Pozor! {CALLBACK_URL} musí být encodovaná, obvzláště pokud obsahuje vlastní query parametry. Viz [URL Encode (msdn)](https://msdn.microsoft.com/en-us/library/zttxte6w.aspx)

```
GET {API_URL}/run?callbackMime={CALLBACK_MIME}&callback={CALLBACK_URL}
```

### Synchroní volání
Synchroní volání umožní
```
GET {API_URL}/runSync
```


