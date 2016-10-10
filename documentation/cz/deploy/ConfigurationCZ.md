| Nasazení |
| -------- |
| 1. [Předpoklady](PrerequirmentsCZ.md) |
| 2. [Kompilace](CompileCZ.md) |
| 2. [Instalace](InstallCZ.md) |
| 3. **Konfigurace** |
|[Hlavní strana](../READMECZ.md)|
# Konfigurace


## Konfigurace serveru
### Secret key aplikace
V ``conf/application.conf``  naleznete ``play.crypto.secret`` jeho hodnotu je potřeba nastavit na vlastní hodnotu. Tento token se využíva při generaci všech sessionů, csrf tokenů a encryptaci. Tudíž je potřebné aby byl unikátní a nezjistitelný pro třetí stranu.

### Url a port
V ``conf/application.conf`` jako ``http.port`` a ``http.address``


### Konfigurace db
Konfigurace db se provádí uvnitř souboru ``conf/application.conf``

### Konfigurace logování
Konfigurace db se provádí uvnitř souboru ``conf/application.conf``

### Multithreading
TODO

### Netty
TODO

## Konfigurace oboustraně zabezpečené komunikace s třetí stranou
Server pro oboustrané zabezpečenou komunikaci využí WS SSL, který je založený na technologii JSSE (Java secure socket extension). V případě že druhá strana využíva certifikát od **veřejně důvěrné autority** tak stačí pouze do ``conf/application.conf`` přidat:
```
play.ws.ssl {
  trustManager = {
    stores = [
      { type = "PEM", path = "/path/to/cert/globalsign.crt" }
    ]
  }
}
```
