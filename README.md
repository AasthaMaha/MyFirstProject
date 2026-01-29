erDiagram
    %% Relationships
    AUTHOR }o--|{ BOOK : writes
    PUBLISHER ||--o{ AUTHOR : represents
    PUBLISHER ||--o{ BOOK : publishes
    BORROWER ||--o{ CHECKOUT : makes
    BOOK ||--o{ CHECKOUT : is_checked_out_in

    %% Entities
    AUTHOR {
        int author_id PK
        string name
        int publisher_id FK
    }

    PUBLISHER {
        int publisher_id PK
        string name
    }

    BOOK {
        string isbn PK
        string title
        int publisher_id FK
        date publish_date
    }

    BORROWER {
        int card_no PK
        string name
    }

    CHECKOUT {
        int card_no FK
        string isbn FK
        date checkout_date
        %% If your instructor expects a key here, you can treat this as the identifier:
        %% (card_no, isbn, checkout_date)
    }
