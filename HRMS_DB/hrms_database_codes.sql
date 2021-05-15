-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public."Activation_Codes"
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    activation_code character varying(20) NOT NULL,
    is_confirmed boolean NOT NULL,
    confirmation_date date,
    PRIMARY KEY (id)
);

CREATE TABLE public."Candidates"
(
    id integer NOT NULL,
    first_name character varying(25) NOT NULL,
    last_name character varying(25) NOT NULL,
    national_id character varying(11) NOT NULL,
    birth_date date NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Candidates_Activiton_Codes"
(
    id integer NOT NULL,
    candidate_id integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Employees"
(
    id integer NOT NULL,
    first_name character varying(25) NOT NULL,
    last_name character varying(25) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Employers"
(
    id integer NOT NULL,
    company_name character varying(50) NOT NULL,
    website_address character varying(50) NOT NULL,
    phone_number character varying(12) NOT NULL,
    is_activated boolean NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Employers_Activation_By_Employees"
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    employer_id integer NOT NULL,
    employee_id integer NOT NULL,
    is_confirmed boolean NOT NULL,
    confirmation_date date,
    PRIMARY KEY (id)
);

CREATE TABLE public."Employers_Activation_Codes"
(
    id integer NOT NULL,
    employer_id integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Positions"
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    position_name character varying(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Users"
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    email character varying(50) NOT NULL,
    password character varying(25) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public."Candidates"
    ADD FOREIGN KEY (id)
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."Candidates_Activiton_Codes"
    ADD FOREIGN KEY (candidate_id)
    REFERENCES public."Candidates" (id)
    NOT VALID;


ALTER TABLE public."Candidates_Activiton_Codes"
    ADD FOREIGN KEY (id)
    REFERENCES public."Activation_Codes" (id)
    NOT VALID;


ALTER TABLE public."Employees"
    ADD FOREIGN KEY (id)
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."Employers"
    ADD FOREIGN KEY (id)
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."Employers_Activation_By_Employees"
    ADD FOREIGN KEY (employee_id)
    REFERENCES public."Employees" (id)
    NOT VALID;


ALTER TABLE public."Employers_Activation_By_Employees"
    ADD FOREIGN KEY (employer_id)
    REFERENCES public."Employers" (id)
    NOT VALID;


ALTER TABLE public."Employers_Activation_Codes"
    ADD FOREIGN KEY (employer_id)
    REFERENCES public."Employers" (id)
    NOT VALID;


ALTER TABLE public."Employers_Activation_Codes"
    ADD FOREIGN KEY (id)
    REFERENCES public."Activation_Codes" (id)
    NOT VALID;

END;