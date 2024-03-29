# Tracce
* ### Java Shop :carello_della_spesa:
      Creare la classe Prodotto che gestisce i prodotti dello shop.
      Un prodotto è caratterizzato da:
        - codice (numero intero)
        - nome
        - descrizione
        - prezzo
        - iva
      Alla creazione di un nuovo prodotto il codice deve essere valorizzato con un numero random di massimo 8 cifre.
      Il prodotto espone sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva.
      Il prodotto espone anche un metodo per avere il nome esteso, ottenuto concatenando codice-nome: se il codice è inferiore a 8 cifre fa inserito un pad left di 0.
      Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto: create almeno due prodotti con valori diversi ed invocate i metodi verificando la correttezza dei risultati.
* ### Java Bank :bottino:
      Creare la classe Conto caratterizzata da:
         - numero di conto
         - nome del proprietario
         - saldo
      Inoltre la classe deve esporre
      un metodo per versare una somma di denaro sul conto
      uno per prelevare una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)
      altri metodi per ritornare le informazioni del conto e il saldo
      Aggiungere una classe Bank con metodo main, dove chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)
      Poi chiediamo all’utente cosa vuole fare dando 3 opzioni: versare una somma o prelevare una somma di denaro o uscire.
      Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o prelevare e proviamo ad effettuare l’operazione sul conto.
      Se l’operazione non è valida mostriamo un messaggio di errore. Se l’operazione va a buon fine mostriamo il saldo attuale del conto. Il menu continua ad apparire fino a che l’utente sceglie di uscire.

    