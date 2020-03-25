INSERT INTO family (id, last_name) VALUES ('7a847cdb-cb62-4d02-95aa-1c00f73a940c', 'Hardy');

INSERT INTO member (id, family_id, name, email, password, is_parent) VALUES ('c2a4b19d-2dea-4ab5-986c-2f58315f3907',
                                                                               '7a847cdb-cb62-4d02-95aa-1c00f73a940c',
                                                                               'Fenton', 'fenton@hardys.com', 'pass', true);
INSERT INTO member (id, family_id, name, email, password, is_parent) VALUES ('81f11e4f-5fce-42e3-bf82-2da6289dd3ce',
                                                                               '7a847cdb-cb62-4d02-95aa-1c00f73a940c',
                                                                               'Frank', 'frank@hardys.com', 'pass', false);
INSERT INTO member (id, family_id, name, email, password, is_parent) VALUES ('1f7bc474-96db-449b-a9a8-3c4565f9aa5a',
                                                                               '7a847cdb-cb62-4d02-95aa-1c00f73a940c',
                                                                               'Joe', 'joe@hardys.com', 'pass', false);

INSERT INTO chores (id, member_id, name, frequency, start_date) VALUES ('a7ee2ac5-cdd1-48fc-a743-f166d50e300b',
                                                                          '81f11e4f-5fce-42e3-bf82-2da6289dd3ce',
                                                                          'Sweep', 10, now());
INSERT INTO chores (id, member_id, name, frequency, start_date) VALUES ('1f7bc474-96db-449b-a9a8-3c4565f9aa5a',
                                                                          '81f11e4f-5fce-42e3-bf82-2da6289dd3ce',
                                                                          'Mop', 10, now());
