
#### Account Servisi (Account Yaratma)
```
 http://localhost:8501/account

{
	"username" : "temelt",
    "name" : "Taner",
    "surname" : "TEMEL",
    "email" : "haydi.kodlayalim@gmail.com",
    "birthDate" : "1999-01-01"
}
```

#### Ticket Servisi (Ticket Yaratma)

```
 http://localhost:8502/ticket

{
	"description" : "Test Ticket 1",
    "notes" : "Test Ticket 1 - Docker Compose Hatasi",
    "assignee" : "temelt",
    "priorityType" : "URGENT",
    "ticketStatus" : "OPEN",
    "ticketDate" : "1999-01-01"
}
```