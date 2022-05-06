# Componente di Prodotto

APISANESEN

## Descrizione del prodotto

Si tratta di API di orchestrazione rivolte al cittadino tra il front end, realizzato tramite il prodotto SANSOL pubblicato in xxx, e i servizi di business delle esenzioni da reddito.

## Configurazioni iniziali

I servizi "orchestrati" si trovano ai seguenti link [SERVIZI REST](docs/rest). E' necessario che il file di [properties](buildfiles/prod.properties) sia configurato affinchè punti a dei servizi mock generati secondo tali descrittori.

## Prerequisiti di sistema

Java:
Jdk 1.8

ANT:
Ant version 1.9.6

Server Web:
Apache 2.4.6

Application Server:
JBoss eap 6.4.5

Tipo di database:
postgres v12

## Installazione

lanciare il comando ant -Dtarget prod per generare l'ear

## Deployment

Inserire il file ear generato durante l'installazione sotto la cartella deployments del Jboss

## Versioning

Per il versionamento del software si usa la tecnica Semantic Versioning (http://semver.org).

## Authors

Egidio Bosio

## Copyrights

“© Copyright Regione Piemonte – 2022”

## License

SPDX-License-Identifier: inserire il codice SPDX delle licenza
Veder il file LICENSE per i dettagli.

