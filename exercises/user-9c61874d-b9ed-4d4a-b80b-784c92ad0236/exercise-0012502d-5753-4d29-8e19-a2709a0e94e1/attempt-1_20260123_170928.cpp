void Polynomial::insertTerm(const Term& term) {
    // STUDENT ANSWER
    if(term.coeff == 0) return;
    if (this->terms->empty()) {
        this->terms->add(term);
    } else {
        SLinkedList<Term>::Iterator it;
        if ((*this->terms->begin()).exp < term.exp) {
            this->terms->add(0, term);
            return;
        }

        int counter = 0;
        for (it = this->terms->begin(); it != this->terms->end(); it++) {
            if ((*it).exp < term.exp) {
                this->terms->add(counter, term);
                return;
            }
            if ((*it).exp == term.exp) {
                Term newTerm = Term(term.coeff+(*it).coeff, term.exp);
                if(term.coeff+(*it).coeff == 0){
                    this->terms->removeAt(counter);
                }
                else this->terms->set(counter, newTerm);
                return;
            }
            counter++;
        }

        this->terms->add(term);
    }
}

void Polynomial::insertTerm(double coeff, int exp) {
    // STUDENT ANSWER
    Term term = Term(coeff, exp);
    if(term.coeff == 0) return;
    if (this->terms->empty()) {
        this->terms->add(term);
    } else {
        SLinkedList<Term>::Iterator it;
        if ((*this->terms->begin()).exp < term.exp) {
            this->terms->add(0, term);
            return;
        }

        int counter = 0;
        for (it = this->terms->begin(); it != this->terms->end(); it++) {
            if ((*it).exp < term.exp) {
                this->terms->add(counter, term);
                return;
            }
            if ((*it).exp == term.exp) {
                Term newTerm = Term(term.coeff+(*it).coeff, term.exp);
                if(term.coeff+(*it).coeff == 0){
                    this->terms->removeAt(counter);
                }
                else this->terms->set(counter, newTerm);
                return;
            }
            counter++;
        }
        this->terms->add(term);
    }
}