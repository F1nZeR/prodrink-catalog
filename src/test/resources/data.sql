INSERT INTO public.categories (id, name, parent_category_id, image_url) VALUES (1, 'Beer', null, null);
INSERT INTO public.categories (id, name, parent_category_id, image_url) VALUES (2, 'Light Beer', 1, null);

INSERT INTO public.drinks (id, name, description, image_urls, category_id) VALUES (1, 'My Beer', 'its my beer', 'imgur.com/url', 2);
INSERT INTO public.drinks (id, name, description, image_urls, category_id) VALUES (2, 'My very light beer', 'its my very light beer', 'imgur.com/url', 2);

INSERT INTO public.property_types (id, name, value_type, category_id) VALUES (1, 'beer type', 'STRING', 1);
INSERT INTO public.property_types (id, name, value_type, category_id) VALUES (2, 'light beer type', 'STRING', 2);

INSERT INTO public.properties (id, drink_id, property_type_id, value) VALUES (1, 1, 1, 'value 1');
INSERT INTO public.properties (id, drink_id, property_type_id, value) VALUES (2, 1, 2, 'value 2');

INSERT INTO public.properties (id, drink_id, property_type_id, value) VALUES (3, 2, 1, 'light value 1');
INSERT INTO public.properties (id, drink_id, property_type_id, value) VALUES (4, 2, 2, 'light value 2');
