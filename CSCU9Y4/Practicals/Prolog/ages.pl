
/* Fragments of Prolog as used in lectures for 31Y4/SX42 */


    get_age :-
            write('Enter person: '),
            read(P),
            age(P,A),
            write(P), write(' has age '), write(A).

    person(jane).
    person(jill).
    person(julia).
    person(mary)
    person(alex).
    person(arthur).
    person(bill).
    person(eric).
    person(john).
    person(james).

    age(jane,24).
    age(jill,26).
    age(julia,33).
    age(mary,29).
    age(alex,26).
    age(arthur,26).
    age(bill,33).
    age(eric,17).
    age(john,42).
    age(james,50).

    father(john,eric).
    father(james,mary).
    father(james,jane).
    mother(jane,brian).

    grandfather(X,Y) :-
            father(X,Z), parent(Z,Y).

    parent(X,Y) :- father(X,Y).
    parent(X,Y) :- mother(X,Y).

    father_age(Person,Age) :-
            father(Father,Person),
            age(Father,Age).

    get_father_age :-
            write('Enter person: '),
            read(Person),
            father_age(Person,Age),
            write('The father of '), write(Person),
            write(' has age '), write(Age).
    get_father_age :-
            write('Not known.').

    people_of_age(A) :-
            age(P,A),
            write(P), nl,
            fail.
    people_of_age(A) :-
            write('End of list').

    status(P,past_it) :-
		age(P,A), A > 23.
    status(P,with_it).

    report_status :-
		person(P),
		status(P,S),
		write(S), write(':  '), write(P), nl,
		fail.
    report_status.
		

    
