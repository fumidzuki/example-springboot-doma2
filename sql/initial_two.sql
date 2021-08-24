CREATE schema example_two;
CREATE TABLE example_two.account_two (
  user_id int PRIMARY KEY,
  username varchar ( 128 ) UNIQUE NOT NULL
);
INSERT INTO example_two.account_two (user_id, username) SELECT i, format('username_%s', i) FROM generate_series(1,10) as i;