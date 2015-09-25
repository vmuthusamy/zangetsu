package com.zangetsu.ood;

import java.util.Collection;

import org.joda.time.Instant;

/**
 * Created by vm023561 on 9/24/15.
 */
public class ReservationSystem
{
    public static class Table
    {
        String tableId;
        int capacity;
    }

    public static class Appointment
    {
        String appointmentId;
        Collection<String> tableIds;
        Instant appointmentStartTime;

    }

    public interface ReservationManager
    {
        public boolean isTableAvailable (final Instant appointmentTime,
                final int numberOfCustomers);
    }
}

