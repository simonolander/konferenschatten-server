DROP TABLE IF EXISTS message;
DROP TABLE IF EXISTS meta;

CREATE TABLE message (
  id INT AUTO_INCREMENT PRIMARY KEY,
  timestamp DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  username VARCHAR(255),
  text TEXT,
  image_url VARCHAR(255),
  data JSON
) DEFAULT CHARACTER SET=utf8;

CREATE TABLE meta (
  id INT AUTO_INCREMENT PRIMARY KEY,
  timestamp DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  username VARCHAR(255),
  data JSON
) DEFAULT CHARACTER SET=utf8;

INSERT INTO `message` (`id`, `timestamp`, `username`, `text`, `image_url`, `data`)
VALUES (
    1,
    '2017-08-13 16:25:37',
    'System',
    'Välkommen till Konferenschatten®!',
    'https://images10.newegg.com/NeweggImage/ProductImage/11-165-083-14.jpg',
    '{"text": "test"}'
);

INSERT INTO `meta` (id, timestamp, username, data)
VALUES (
    1,
    '2017-08-13 16:25:37',
    'System',
    '{"type": "LIKE", "messageId": "1"}'
);
