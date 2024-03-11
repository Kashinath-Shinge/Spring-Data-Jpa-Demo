INSERT INTO public.project(project_cost, id, project_name) VALUES(1000000.0, '9f212129-ddff-41db-a067-e38fc0077314', 'LOAN_PROJECT');

INSERT INTO public.department(department_name, id)VALUES('IT', 'ca82c8d7-5e99-4f3c-b8d4-bac89486cd9a');
INSERT INTO public.department(department_name, id)VALUES('HR', '8130da9b-7d12-4a97-9e13-6e316c2fc10a');
INSERT INTO public.department(department_name, id)VALUES('ADMIN', '3dd87407-3e57-4807-8d68-1370e3d34a56');
INSERT INTO public.department(department_name, id)VALUES('FINANCE', '06c0a15c-df58-4897-9e61-404a5099b868');

INSERT INTO public.employee(date_of_joining, department_id, employee_name, id)VALUES('2023-07-06', '06c0a15c-df58-4897-9e61-404a5099b868', 'Sam', 'bef2581f-b25d-44c6-b5c2-243cc4539ddb');
INSERT INTO public.project_emp(employee_id, project_id) VALUES('bef2581f-b25d-44c6-b5c2-243cc4539ddb', '9f212129-ddff-41db-a067-e38fc0077314');