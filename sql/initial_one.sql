CREATE schema example_one;
CREATE TABLE example_one.account_one (
  user_id int PRIMARY KEY,
  username varchar ( 128 ) UNIQUE NOT NULL
);
INSERT INTO example_one.account_one (user_id, username) SELECT i, format('username_%s', i) FROM generate_series(1,10) as i;