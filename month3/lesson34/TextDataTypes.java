package main;

public class TextDataTypes {

    /*

        We want to send an indian chick with name, skirt length, skirt color, eyes, friends

        CSV:

        Sisi, 20, red, blue,

            ->needs documentation (first thing is a name, second is skirt length, etc)
            ->not extensible - one system starts sending more, the other system has to update

        XML:

        <indian>
            <name>Sisi</name>
            <skirtLength>20</skirtLength>
            <skirtColor>red</skirtColor>
            <eyes>blue</eyes>
            <friends>
                <fr>
                    <name>Mimi</name>
                    <eyes>black</eyes>
                </fr>
                <fr>
                    <name>Poli</name>
                    <eyes>black</eyes>
                </fr>
            </friends>
        </indian>

            -> extensible, one system can develop and add to the data, the other system still viable
            -> too much traffic - metadata is a large portion of the actual data
            -> no data types - everything is a string


        JSON:
        {
            "name" : "Sisi",
            "skirtLength" : 20,
            "skirtColor" : "red",
            "eyes" : "blue",
            "friends" : [
                {
                    "name" : "Mimi",
                    "eyes" : "black",
                    "grades" : [3,5,4,2,4]

                },
                {
                    "name" : "Poli",
                    "eyes" : "black"
                }
            ]
        }

            -> extensible
            -> data types -> object, array, number, string, null
            -> less traffic, less metadata, lighter than XML


     */
}
