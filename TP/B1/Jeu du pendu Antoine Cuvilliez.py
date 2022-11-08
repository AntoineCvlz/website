#############################################################
#          Jeu du pendu Antoine Cuvilliez                   #
#############################################################

from random import *

def trouve_lettre(mot,lettre):
    """renvoie True si lettre est dans mot et False sinon"""
    for elt in mot:
        if elt.upper()==lettre.upper():
            return True
    return False

def tirage_mot(tab):
    """renvoie un element tiré au hasard parmi les elements du tableau tab"""
    i=randint(0,len(tab))
    return tab[i]

def saisir_lettre():
    lettre=str(input("Veuiller saisir une lettre : "))                     
    return lettre


def p1():
    print("             ------------")

def p2():
    print("             ------------")
    print("                        |")
    print("                        |")

def p3():
    print("             ------------")
    print("                        |")
    print("                        |")
    print("                        O")

def p4():
    print("             ------------")
    print("                        |")
    print("                        |")
    print("                        O")
    print("                       / ")
    
def p5():
    print("             ------------")
    print("                        |")
    print("                        |")
    print("                        O")
    print("                       /|")
    print("                        |")

def p6():
    print("             ------------")
    print("                        |")
    print("                        |")
    print("                        O")
    print("                       /|\\")
    print("                        |")

def p7():
    print("             ------------")
    print("                        |")
    print("                        |")
    print("                        O")
    print("                       /|\\")
    print("                        |")
    print("                       /")

def p8():
    print("             ------------")
    print("                        |")
    print("                        |")
    print("                        O")
    print("                       /|\\")
    print("                        |")
    print("                       / \\")
    

def affichage_pendu(p):
    if p==1:
        p1()
    if p==2:
        p2()
    if p==3:
        p3()
    if p==4:
        p4()
    if p==5:
        p5()
    if p==6:
        p6()
    if p==7:
        p7()
    if p==8:
        p8()
    
#################### MAIN #############################
    
    #initialisation des variables
tab_mot=["SIO","BTS","CPU","GAMER"] #liste de mot à trouver.ils doivent être en majuscule
mot_a_trouver=tirage_mot(tab_mot)
tab_trouve=['_' for i in range(len(mot_a_trouver))]#Tableau des lettre trouvées.
nb_lettre_trouve=0
nbr_erreur=0
perdu=False

 #Boucle de jeu
while nb_lettre_trouve!=len(tab_trouve) and not perdu:
    l=saisir_lettre()
    if trouve_lettre(mot_a_trouver,l):
        nb_lettre_trouve=nb_lettre_trouve+1
        if not trouve_lettre(tab_trouve,l):
            tab_trouve[mot_a_trouver.index(l.upper())]=l
        print(tab_trouve)
    else:
        nbr_erreur=nbr_erreur+1
        affichage_pendu(nbr_erreur)
        if nbr_erreur==8:
            perdu=True
        
   #Fin boucle de jeu     
if perdu==True:
    print("***********************************************************************")
    print("************************    PERDU    **********************************")
    print("***********************************************************************")
else:
    print("***********************************************************************")
    print("************************    GAGNE    **********************************")
    print("***********************************************************************")
    
   





    
