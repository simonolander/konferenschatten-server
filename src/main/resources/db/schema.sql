DROP TABLE IF EXISTS message;

CREATE TABLE message (
  id INT AUTO_INCREMENT PRIMARY KEY,
  timestamp DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  username VARCHAR(255),
  text TEXT,
  image_url VARCHAR(255),
  extra JSON
);

INSERT INTO `message` (`id`, `timestamp`, `username`, `text`, `image_url`, `extra`)
VALUES (
    1,
    '2017-08-13 16:25:37',
    'System',
    'Välkommen till Konferenschatten®!',
    'https://images10.newegg.com/NeweggImage/ProductImage/11-165-083-14.jpg',
    '{"text": "test"}'
);
