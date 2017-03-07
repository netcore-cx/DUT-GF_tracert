# GF_tracert

Liste des Classes à faire : [*ici*](https://1drv.ms/w/s!AnLiTPOXBCZTvB8Z_AQ4HkCNA2RN)

# Method
```
public void setInterfaceList(ArrayList<InterfaceActive> newInterfaceList)
```
--> Change la Liste ArrayList<Interface> par une autre liste ArrayList<Interface>


```
addInterface(InterfaceActive newInterfaceActive)
```
--> Ajoute un Interface à la suite de la liste


```
setInterfaceById(int id, InterfaceActive newInterfaceActive)
```
--> Change une Interface dans la Liste par une autre Interface

```
ArrayList<InterfaceActive> getInterfaceList()
```
--> Retourne La liste d'Interface

```
InterfaceActive getInterfaceById(int id)
```
--> Retourne un interface

# Ping
```
boolean canPing(@dest)
```
 * permet de savoir si une interface peut en ping une autre.fait appelle à d'autres fonctions pour savoir ci c'est le cas ou non
```
isLocal(@ipDest)
```
 * Permets de savoir si un @ip de destination du ping est dans le même réseau que @ip Src (logiquement -> en faisant un & logique entre @ipDest & maskSrc, et @ipSrc & maskSrc, On comparent les deux net_id trouvait)
```
isPrivateIP (@src)
```
```
isLinkedTo(@dest)
```
Savoir si l'interface de destination est accéssible avec l'interface source
