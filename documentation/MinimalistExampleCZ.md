# Minimalist ukázková implementace
## Zjednodušená ukázka bez obsahu hlaviček, těl zpráv a návratových hodnot
```
GET       {API_URL}/service/token - Získání authentikačního tokenu.
POST      {API_URL}/minimalist - Vytvoření minimalist a získání jeho id.
PUT       {API_URL}/minimalist/{ID}/settings?category=sourcecode&name=java&version=1.8&mode=tokencompare - Nastavení testu. *
POST      {API_URL}/minimalist/{ID}/uploadEntity - Vytvoření entity a náhrání jejich dat. Vrací id entity. **
POST      {API_URL}/minimalist/{ID}/compareAgainst?id={OTHER_ID} - Přidá testování oproti jinému minimalist objektu.
GET       {API_URL}/minimalist/{ID}/run - Spuštění testu. ***
...
GET       {API_URL}/minimalist/{ID}/report - Po dokončení testu se zde bude nacházet report. *** 
```
\* Tento řádek pravděpodobně vypadá trochu složitěji. Přesnou configuraci naleznete zde: [Nastavení testu](TrialSettingsCZ.md#Minimalist)
\*\* Prováděno opakovaně dokud nejsou nahrané všechny požadované entity které se mají mezi sebou otestovat.
\*\*\* Pokud test nebyl ještě proveden tak volání vrací [http code 204](https://httpstatuses.com/204). Ostatní možnosti implementace run/report naleznete [zde](MinimalistImplementationCZ.md#Informace-o-provedení-testu)




> CURL
```
curl -X GET --header 'Content-Type: application/x-www-form-urlencoded' --header 'Accept: application/json' -d 'grant_type=client_credentials&client_id=C113nt1D&client_secret=C113nTS3CR3t' 'http://prosecutor.fel.cvut.cz/service/token'
```


#### V případě že soubory Entit jsou příliš velké pro nahrání:
[Zde](FAQCZ.md)