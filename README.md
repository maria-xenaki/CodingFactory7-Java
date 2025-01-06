Contains the following projects from the AUEB Program Coding Factory 7:

Project 1:
Αναπτύξτε ένα πρόγραμμα σε Java που να διαβάζει από ένα αρχείο ακέραιους 
αριθμούς (το αρχείο πρέπει να περιέχει περισσότερους από 6 αριθμούς και το πολύ 
49 αριθμούς) με τιμές από 1 έως 49. Τους αριθμούς αυτούς τους εισάγει σε ένα 
πίνακα, τον οποίο ταξινομεί (π.χ. με την Arrays.sort()). Στη συνέχεια, το πρόγραμμα
παράγει όλες τις δυνατές εξάδες (συνδυασμούς 6 αριθμών). Ταυτόχρονα και αμέσως 
μετά την παραγωγή κάθε εξάδας ‘φιλτράρει’ κάθε εξάδα ώστε να πληροί τα 
παρακάτω κριτήρια: 1) Να περιέχει το πολύ 4 άρτιους, 2) να περιέχει το πολύ 4 
περιττούς, 3) να περιέχει το πολύ 2 συνεχόμενους, 4) να περιέχει το πολύ 3 ίδιους 
λήγοντες, 5) να περιέχει το πολύ 3 αριθμούς στην ίδια δεκάδα. 
Τέλος, εκτυπώνει τις τελικές εξάδες σε ένα αρχείο με όνομα της επιλογής σας και 
κατάληξη.txt

Project 3:
Αναπτύξτε μία εφαρμογή που διαβάζει έναν-έναν τους χαρακτήρες ενός αρχείου και 
τους εισάγει σε ένα πίνακα 128x2. Υποθέστε ότι οι χαρακτήρες είναι λατινικοί. Κάθε 
θέση του πίνακα είναι επομένως ένας πίνακας δύο θέσεων, όπου στην 1η θέση 
αποθηκεύεται ο χαρακτήρας που έχει διαβαστεί (αν δεν υπάρχει ήδη στον πίνακα) 
και στην 2η θέση αποθηκεύεται το πλήθος των φορών που έχει διαβαστεί (βρεθεί) 
κάθε χαρακτήρας. Αγνοήστε τα κενά και τις αλλαγές γραμμής και γενικά τα 
whitespaces.
Στο τέλος η main() παρουσιάζει στατιστικά στοιχεία για κάθε χαρακτήρα όπως η 
συχνότητα εμφάνισής του στο κείμενο ταξινομημένα ανά χαρακτήρα και ανά 
συχνότητα εμφάνισης.

Project4: 
Αναπτύξτε ένα παιχνίδι Τρίλιζα, όπου δύο παίκτες παίζουν Χ και Ο (ή 1 και 2 αν θέλετε 
να υλοποιήσετε με πίνακα ακεραίων και όχι με πίνακα char) και κερδίζει ο παίκτης 
που έχει συμπληρώσει τρία ίδια σύμβολα ή αριθμούς σε οποιαδήποτε διάσταση του 
πίνακα, οριζόντια, κάθετα ή διαγώνια.
Η main() μπορεί να ελέγχει τη ροή του παιχνιδιού, όπως ποιος παίκτης παίζει κάθε 
φορά (εναλλαγή μεταξύ των δύο παικτών), να διαβάζει από το stdin το σύμβολο που 
δίνει ο κάθε παίκτης και να εμφανίζει με γραφικό τρόπο την τρίλιζα μετά από κάθε 
κίνηση κάθε παίκτη.
Ενώ, μπορείτε να δημιουργήσετε και μία μέθοδο που να ελέγχει (μετά από κάθε 
κίνηση) αν ο παίκτης που έκανε την κίνηση έκανε τρίλιζα.
Το πρόγραμμα θα πρέπει να λαμβάνει υπόψη την περίπτωση ισοπαλίας όπως και να 
μην επιτρέπει ένας παίκτης να παίξει σε θέση που είναι ήδη κατειλημμένη. 

Project 5:
Έστω ένα θέατρο που έχει θέσεις όπου η κάθε θέση περιγράφεται με ένα χαρακτήρα 
που είναι η στήλη και ένα αριθμό που είναι η σειρά. Για παράδειγμα η θέση C2 
βρίσκεται στην 2η σειρά και 3η στήλη.
Αναπτύξτε ένα πρόγραμμα διαχείρισης θεάτρου με 30 σειρές και 12 στήλες. Πιο 
συγκεκριμένα γράψτε μία μέθοδο void book(char column, int row) που να κάνει book
μία θέση αν δεν είναι ήδη booked και μία μέθοδο void cancel(char column, int row) 
που να ακυρώνει την κράτηση μία θέσης αν είναι ήδη booked.
