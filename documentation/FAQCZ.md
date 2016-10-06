# FAQ (Často kladené otázky)

#### Soubory entit jsou příliš velké pro nahrání uploadem.
##### Minimalist
Pro tento případ můžete využít:

```
POST {API_URL}/minimalist/{MINIMALIST_ID}/entity  - Vytvoření nové entity
RETURN 200 - API vrátí v těle zprávy ID nově vytvořené entity

POST {API_URL}/minimalist/{MINIMALIST_ID}/entity/{ID}/file  - V body se bude nacházet nahrávaný soubor.
RETURN  
```