# TP_0_ICT301_BILLE_THEOPHILE

## Auteur

**Nom :** BILLE THEOPHILE

**Prénom :** KEVIN

**Spécialité :** Génie Logiciel

**Matricule :** 23V2291

## Sommaire

### Présentation des principes SOLID

### SRP - Single Responsibility Principle

Ce concept stipule que chaque classe devrait avoir une seule responsabilité et donc une seule raison de changer.

Dans le contexte du cours, nous avons une classe Book qui gère les données, l'affichage, la sauvegarde en base de données et la logique métier. Par conséquent, dans le cadre de ce TP, nous allons préférer séparer ces responsabilités en plusieurs classes distinctes.

#### Avant refactoring :
- Une classe Book gère les données, l'affichage, la sauvegarde en base de données et la logique métier.

#### Après refactoring :
- Chaque responsabilité est confiée à une classe spécifique.
- La classe Book gère les données.
- La classe BookPrinter gère l'affichage.
- La classe BookSaver gère la sauvegarde en base de données.
- La classe BookBusinessLogic gère la logique métier.

#### Structure des fichiers :

```
SRP/
├── apres/
│   ├── Book.java
│   ├── BookPrinter.java
│   ├── BookSaver.java
│   └── BookBusinessLogic.java
└── avant/          
    └── Book.java
```