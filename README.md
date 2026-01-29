erDiagram

    AUTHOR {
        int author_id PK
        string name
    }

    PUBLISHER {
        int publisher_id PK
        string name
    }

    BOOK {
        string isbn PK
        string title
    }

    BORROWER {
        int card_no PK
        string name
    }

    CHECKOUT {
        date checkout_date
    }

    %% Relationships

    AUTHOR }o--|{ BOOK : writes

    PUBLISHER ||--o{ AUTHOR : represents

    PUBLISHER ||--o{ BOOK : publishes
    BOOK }|--|| PUBLISHER : "published by"

    BORROWER ||--o{ CHECKOUT : makes
    BOOK ||--o{ CHECKOUT : "checked out in"
