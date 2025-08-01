public class p2_4_5 {

    /*
        1 1 1
        1 1 1
        1 1 1


        flow(isOpen, isFull, i+1, j);
        flow(isOpen, isFull, i, j+1);
        flow(isOpen, isFull, i, j-1);
        flow(isOpen, isFull, i-1, j);

        flow(isOpen, isFull, 1, 0);
            flow(isOpen, isFull, 2, 0);

                flow(isOpen, isFull, 3, 0);
                flow(isOpen, isFull, 2, 1);
                    flow(isOpen, isFull, 3, 1);
                    flow(isOpen, isFull, 2, 2);
                        flow(isOpen, isFull, 3, 2);
                        flow(isOpen, isFull, 2, 3);
                        flow(isOpen, isFull, 2, 1);
                        flow(isOpen, isFull, 1, 2);
                            flow(isOpen, isFull, 2, 2);
                            flow(isOpen, isFull, 1, 3);
                            flow(isOpen, isFull, 1, 1);
                                 flow(isOpen, isFull, 2, 1);
                                 flow(isOpen, isFull, 1, 2);
                                 flow(isOpen, isFull, 1, 0);
                                 flow(isOpen, isFull, 0, 1);
                                    flow(isOpen, isFull, 1, 1);
                                    flow(isOpen, isFull, 0, 2);
                                    flow(isOpen, isFull, 0, 0);
                                    flow(isOpen, isFull, -1, 1);
                            flow(isOpen, isFull, 0, 2);

                    flow(isOpen, isFull, 2, 0);
                    flow(isOpen, isFull, 1, 1);





        ...



     */
}
