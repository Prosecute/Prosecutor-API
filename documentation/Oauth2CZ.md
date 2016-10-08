# Autentizace a Autorizace
Pro autentizace a autorizaci služba využívá Oauth2 s client creditals grant typem. Více informací [zde](https://bshaffer.github.io/oauth2-server-php-docs/grant-types/client-credentials/). 

### Service
Service služí jako root přístup do služby. 
### Service user


## Oauth 2 Scopes
### Společné Scopes
| ID | Popis |
| ---- | ----------- |
| auth | Globální scope vyžadující autentizaci pro danou akci |
| entity.read | Povoluje zobrazování informací o entitách, nikoliv však jejich souborů. |
| entity.write | Povoluje vytváření, upravování a mazání entity objektů. |
| file.upload.* | Povoluje nahrání všech druhů souborů. |
| file.upload.csv | Povoluje nahrávání pouze *.csv souborů. |
| file.download.* | Povoluje stažení všech druhů souborů. |
| file.delete.* | Povoluje smazání všech druhů souborů. |
| test.run.sync | Povoluje spouštění synchroních testů. |
| test.run.sync.callback | Povoluje volání callbacků. |
| test.run.async | Povoluje spouštění asynchroních testů. |
| test.report.read | Povoluje zobrazování reportů testů. |
### Normální Scopes
| ID | Popis |
| -- | ----- |
| solution.read ||
| solution.write ||
| group.read ||
| group.write ||
| suite.read ||
| suite.write ||
| task.read ||
| task.write ||


### Minimalist Scopes
| ID | Popis |
| ---- | ----------- |
| minimalist.read | Povoluje zobrazování informací o minimalist objektech. |
| minimalist.write | Povoluje vytváření, upravování a mazání minimalist objektů. |
| minimalist.join | Povoluje zobrazování, vytváření, upravování, mazání spojů mezi minimalist. | 